/**
 * 
 */
package com.supurb.java.patterns.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Facotry implementation following the Open-Close Principle
 * 
 * @author Subhojit
 *
 */
public class FactoryOCP {

	/**
	 * 
	 */
	public FactoryOCP() {
		// TODO Auto-generated constructor stub
	}
	
	public enum VehicleType  {
		TRUCK ("Truck") ,
		CAR ("Car");
		
		String vehicleClassName;
		
		private VehicleType(String vehicleClassName) {
			
			this.vehicleClassName = vehicleClassName;
		}
		
		public String getVehicleClassName()
		{
			return this.vehicleClassName;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = VehicleFactory.createVehicle(VehicleType.TRUCK, "Ford", 2012, "F150");
		if (null != v)
		{
			System.out.println(v.toString());
		}
		else
		{
			System.out.println("Vehicle is not created");
		}
		
		Vehicle c = VehicleFactory.createVehicle(VehicleType.CAR, "Mercedes", 2017, "C120");
		if (null != c)
		{
			System.out.println(c.toString());
		}
		else
		{
			System.out.println("Vehicle is not created");
		}
		
	}
	
	
	
	
	private abstract class Vehicle 
	{
		public String name;
		public int make; 
		public String model;
		
		public Vehicle (String name, Integer make, String model) {
			this.name = name;
			this.make = make;
			this.model = model;
		}
				
		public abstract String getName();
		public abstract int getMake();
		public abstract String getModel();
		
		@Override
		public String toString()
		{
			return this.getClass().getCanonicalName() + "|" + getName() + "|" + getMake() + "|" + getModel();
		}

	}
	
	class Truck extends Vehicle{

		public Truck (String name, Integer make, String model) {
			super (name, make, model);
		}
		
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return super.name;
		}

		@Override
		public int getMake() {
			// TODO Auto-generated method stub
			return super.make;
		}

		@Override
		public String getModel() {
			// TODO Auto-generated method stub
			return super.model;
		}
		
	}
	
	class Car extends Vehicle{
		

		public Car(String name, Integer make, String model) {
			super(name, make, model);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return super.name;
		}

		@Override
		public int getMake() {
			// TODO Auto-generated method stub
			return super.make;
		}

		@Override
		public String getModel() {
			// TODO Auto-generated method stub
			return super.model;
		}
		
	}
	
	
	private static class VehicleFactory{
		@SuppressWarnings("unchecked")
		public static Vehicle createVehicle(VehicleType vtype, String name, int make, String model) {
			
			Vehicle v = null;
			try {
				String pathName = FactoryOCP.class.getCanonicalName();
				try {
					FactoryOCP focp = new FactoryOCP();
					String nameToLoad = pathName + "$" +vtype.getVehicleClassName();
//					System.out.println("nameToLoad" + nameToLoad);
					
					Class<Vehicle> c = (Class<Vehicle>) focp.getClass().getClassLoader().loadClass(nameToLoad);
					
/* remove comments around this if facing issues reading constructors */
//					Constructor lCons[] = c.getConstructors();
//			         for(int i = 0; i < lCons.length; i++) {
//			            System.out.println(lCons[i]);
//			         } 
					 
					Constructor<Vehicle> cV = c.getConstructor(focp.getClass(), String.class,Integer.class,String.class);
					v = cV.newInstance(focp, name, make, model);
					
					
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//v = (Vehicle) (new FactoryOCP()).new Truck(name, make, model);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
			return v;
		}
	}
	
	
}