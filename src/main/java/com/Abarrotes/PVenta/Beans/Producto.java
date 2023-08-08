package com.Abarrotes.PVenta.Beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_Prod")
	private int id_Prod;
	@Column (name = "cve_Prod")
	private int cve_Prod;
	@Column (name = "nom_Prod")
	private String nom_Prod;
	@Column (name = "pre_Prod")
	private float pre_Prod;
	private int inv_exi_Prod;
	private int inv_stock_Prod;
	private int prod_tot_Ven;
	private String url_nom_Img;
	private int id_prov_Prod;
	@ManyToOne(optional=false)
	@JoinColumn(name="id_prov_Prod" ,referencedColumnName="id_Prov",insertable=false, updatable=false)
	private Proveedor proveedor;
	
	
	public Proveedor getProveedor() 
	{
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) 
	{
		this.proveedor = proveedor;
	}
	/**
	 * @param id_Prod
	 * @param cve_Prod
	 * @param nom_Prod
	 * @param pre_Prod
	 * @param inv_exi_Prod
	 * @param inv_stock_Prod
	 * @param prod_tot_Ven
	 */
	public Producto(int id_Prod, int cve_Prod, String nom_Prod, float pre_Prod, int inv_exi_Prod, int inv_stock_Prod,
			int prod_tot_Ven, String url_nom_Img, int id_prov_Prod) 
	{
		this.id_Prod = id_Prod;
		this.cve_Prod = cve_Prod;
		this.nom_Prod = nom_Prod;
		this.pre_Prod = pre_Prod;
		this.inv_exi_Prod = inv_exi_Prod;
		this.inv_stock_Prod = inv_stock_Prod;
		this.prod_tot_Ven = prod_tot_Ven;
		this.url_nom_Img = url_nom_Img;
		this.id_prov_Prod = id_prov_Prod;
	}
	public Producto()
	{
		
	}
	public int getId_Prod() 
	{
		return id_Prod;
	}
	public void setId_Prod(int id_Prod) 
	{
		this.id_Prod = id_Prod;
	}
	public int getCve_Prod() 
	{
		return cve_Prod;
	}
	public void setCve_Prod(int cve_Prod) 
	{
		this.cve_Prod = cve_Prod;
	}
	public String getNom_Prod() 
	{
		return nom_Prod;
	}
	public void setNom_Prod(String nom_Prod) 
	{
		this.nom_Prod = nom_Prod;
	}
	public float getPre_Prod() 
	{
		return pre_Prod;
	}
	public void setPre_Prod(float pre_Prod) 
	{
		this.pre_Prod = pre_Prod;
	}
	public int getInv_exi_Prod() 
	{
		return inv_exi_Prod;
	}
	public void setInv_exi_Prod(int inv_exi_Prod) 
	{
		this.inv_exi_Prod = inv_exi_Prod;
	}
	public int getInv_stock_Prod() 
	{
		return inv_stock_Prod;
	}
	public void setInv_stock_Prod(int inv_stock_Prod) 
	{
		this.inv_stock_Prod = inv_stock_Prod;
	}
	public int getProd_tot_Ven() 
	{
		return prod_tot_Ven;
	}
	public void setProd_tot_Ven(int prod_tot_Ven) 
	{
		this.prod_tot_Ven = prod_tot_Ven;
	}
	public String getUrl_nom_Img() 
	{
		return url_nom_Img;
	}
	public void setUrl_nom_Img(String url_nom_Img) 
	{
		this.url_nom_Img = url_nom_Img;
	}
	public int getId_prov_Prod() 
	{
		return id_prov_Prod;
	}
	public void setId_prov_Prod(int id_prov_Prod) 
	{
		this.id_prov_Prod = id_prov_Prod;
	}
	@Override
	public String toString() 
	{
		return "Producto [id_Prod=" + id_Prod + ", cve_Prod=" + cve_Prod + ", nom_Prod=" + nom_Prod + ", pre_Prod="
				+ pre_Prod + ", inv_exi_Prod=" + inv_exi_Prod + ", inv_stock_Prod=" + inv_stock_Prod + ", prod_tot_Ven="
				+ prod_tot_Ven + ", url_nom_Img=" + url_nom_Img + ", id_prov_Prod=" + id_prov_Prod + ", getId_Prod()="
				+ getId_Prod() + ", getCve_Prod()=" + getCve_Prod() + ", getNom_Prod()=" + getNom_Prod()
				+ ", getPre_Prod()=" + getPre_Prod() + ", getInv_exi_Prod()=" + getInv_exi_Prod()
				+ ", getInv_stock_Prod()=" + getInv_stock_Prod() + ", getProd_tot_Ven()=" + getProd_tot_Ven()
				+ ", getUrl_nom_Img()=" + getUrl_nom_Img() + ", getid_prov_Prod()=" + getId_prov_Prod() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	
}
