package brokenrobotgame.model;

import brokenrobotgame.model.navigation.CellPosition;

/*
 * Battery - обладает зарядом, который может отдавать другим устройствам
 */
public class Battery extends AbstractBattery
{
    public Battery(GamField field, int capacity, int amount)
    {
        super(field,capacity,amout);
    }
}
