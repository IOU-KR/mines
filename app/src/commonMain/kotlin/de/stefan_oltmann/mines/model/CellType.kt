/*
 * 💣 Mines 💣
 * Copyright (C) 2025 Stefan Oltmann
 * https://github.com/StefanOltmann/mines
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.stefan_oltmann.mines.model

enum class CellType(
    val adjacentMineCount: Int
) {
    //! DO NOT USE 9 for `adjacentMineCount` see: GameState.toString()
    EMPTY(0),
    MINE(-1),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8);

    companion object {
        val CellTypeMap: Map<Int, CellType> by lazy {
            entries.associateBy { it.adjacentMineCount }
        }
        fun ofMineCount(mineCount: Int): CellType = CellTypeMap[mineCount]?: run{EMPTY}
    }
}
