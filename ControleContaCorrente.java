public class Conta2
{
    private String numero;    
    private double saldo;
    private double limite;
    private double saque;
    private double deposito;
    private double consultaSaldo;
    private double alteraLimite;
    public Conta2(String c , double l)
    {
    	this.numero = c;
    	this.limite = l;
    }
    public Conta2(String c, double l, double s)
    {
    	this.numero = c;
    	this.limite = l;
    	this.saldo = s;
    }
    
    public void saque(double v)
    {
    	if(this.saque > 0)
    	{
    		this.saldo = this.saldo - v;
    	}
    	else
    	{
    		this.limite = this.limite - v;
    	}
    }
    
    public void deposito(double v)
    {
    	if(this.deposito == 0)
    	{
         	this.saldo = this.saldo + v;
    	}
    	else
    	{
    		this.limite = this.limite + v;
    	}
    }
    public double consultaSaldo()
    {
    	return this.consultaSaldo;
    }
    
    public void alteraLimite(double v)
    {
    	this.alteraLimite = this.limite + v;
    }
}
