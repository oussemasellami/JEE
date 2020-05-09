package Interfaces;

import javax.ejb.Remote;

@Remote

public interface InterfaceStat {
	public long getNombredevJPQL();
	public long getNombrefinJPQL() ;
	public long getNombrecompJPQL();
	public long getPoureRequestJPQL();
	public long getNombredsJPQL();
}
