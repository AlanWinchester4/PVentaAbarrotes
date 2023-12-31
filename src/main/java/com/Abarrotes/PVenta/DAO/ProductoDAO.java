package com.Abarrotes.PVenta.DAO;

import java.util.List;

import com.Abarrotes.PVenta.Beans.Producto;

public interface ProductoDAO 
{
	public abstract List<Producto> All();
	
	public abstract Producto findById(Integer id);
	
	public abstract void save(Producto producto);
	
	public abstract void delete(Producto producto);
}
