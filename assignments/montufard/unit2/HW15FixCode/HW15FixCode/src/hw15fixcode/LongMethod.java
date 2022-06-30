
package hw15fixcode;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.msi
 */
public void UpdateQuality()
{
	for (var i = 0; i < Items.Count; i++)
	{
		if (Items[i].Name != "Aged Brie" && Items[i].Name != "Backstage passes to a TAFKAL80ETC concert")
		{
			DecrementQualityForNormalItems(i);
		}
		else
		{
			UpdateQualityForItemsThatAgeWell(i);
		}

		if (Items[i].Name != "Sulfuras, Hand of Ragnaros")
		{
			Items[i].SellIn = Items[i].SellIn - 1;
		}

		if (Items[i].SellIn < 0)
		{
			UpdateQualityForExpiredItems(i);
		}
	}
}
    

