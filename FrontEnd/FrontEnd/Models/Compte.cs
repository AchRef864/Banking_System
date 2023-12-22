namespace FrontEnd.Models
{
	public class Compte
	{
		public string Code { get; set; }
		public float Solde { get; set; }
		public DateTime DateCreation { get; set; }
		public Compte(string code, float solde, DateTime dateCreation)
		{
			Code = code;
			Solde = solde;
			DateCreation = dateCreation;
		}
	}

}
