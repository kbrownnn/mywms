/* 
Copyright 2019 Matthias Krane
info@krane.engineer

This file is part of the Warehouse Management System mywms

mywms is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.
 
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/
package de.wms2.mywms.shipping;

/**
 * This event fired when a picking order changes its state.
 * 
 * @author krane
 *
 */
public class ShippingOrderLineStateChangeEvent {
	private ShippingOrderLine shippingOrderLine;
	private int oldState;
	private int newState;

	public ShippingOrderLineStateChangeEvent(ShippingOrderLine shippingOrderLine, int oldState, int newState) {
		this.shippingOrderLine = shippingOrderLine;
		this.oldState = oldState;
		this.newState = newState;
	}

	public ShippingOrderLine getShippingOrderLine() {
		return shippingOrderLine;
	}

	public int getOldState() {
		return oldState;
	}

	public int getNewState() {
		return newState;
	}

}
