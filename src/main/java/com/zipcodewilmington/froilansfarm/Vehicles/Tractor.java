package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Vehicle;

import java.util.ArrayList;


public class Tractor implements FarmVehicle<Farmer>, Vehicle {

    public boolean operate(Farm farm) {
        return true;
    }

    @Override
    public boolean rider(Rider rider) {
        return rider instanceof Farmer;
    }

    public ArrayList<Edible> harvest(CropRow cropRow){

        return cropRow;
    }

//    @Override
    public String makeNoise() {
        return "rumble rumble rumble";
    }
}
