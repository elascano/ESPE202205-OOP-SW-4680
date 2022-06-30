package ec.esu.espe.controller;

import ec.esu.espe.model.Zoo;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public interface IAnimal {
    public void feed();
    public void addToZoo(Zoo zoo);
}
