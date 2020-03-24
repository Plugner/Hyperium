/*
 *       Copyright (C) 2018-present Hyperium <https://hyperium.cc/>
 *
 *       This program is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published
 *       by the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       This program is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.event.network.server.hypixel;

import java.util.List;

import cc.hyperium.event.Event;
import com.google.common.base.Preconditions;
import org.jetbrains.annotations.NotNull;

/**
 * Invoked when player(s) win a game
 */
public final class HypixelWinEvent extends Event {

  @NotNull
  private final List<String> winners;

  public HypixelWinEvent(@NotNull List<String> winners) {
    Preconditions.checkNotNull(winners, "winners");

    this.winners = winners;
  }

  @NotNull
  public final List<String> getWinners() {
    return winners;
  }
}
