import java.util.Scanner;


public class Mensajes {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		int numero = 1;
		for (int i = 0; i < casos; i++) 
		{
			int l = entrada.nextInt();
			String cadena = entrada.next();
			int cont = 0;
			for (int j = 0; j < l; j++)
			{
				if(cadena.charAt(j)=='C' || cadena.charAt(j)=='c' || cadena.charAt(j)=='(')
				{j++;
					if(j<cadena.length())
					{
						if(cadena.charAt(j)=='o' || cadena.charAt(j)=='O' || cadena.charAt(j)=='0')
						{j++;
							if(j<cadena.length())
							{
								if(cadena.charAt(j)=='d' || cadena.charAt(j)=='D')
								{j++;
									if(j<cadena.length())
									{
										if(cadena.charAt(j)=='E' || cadena.charAt(j)=='e' || cadena.charAt(j)=='3')
										{j++;
											if(j<cadena.length())
											{
												if(cadena.charAt(j)=='R' || cadena.charAt(j)=='r')
												{j++;
													if(j<cadena.length())
													{
														if(cadena.charAt(j)=='o' || cadena.charAt(j)=='O' || cadena.charAt(j)=='0')
														{j++;
															if(j<cadena.length())
															{
																if(cadena.charAt(j)=='A' || cadena.charAt(j)=='a' || cadena.charAt(j)=='@')
																{j++;
																	if(j<cadena.length())
																	{
																		if(cadena.charAt(j)=='D' || cadena.charAt(j)=='d')
																		{j++;
																			cont++;
																		}
																		else
																			j--;
																	}
																}
																else
																	j--;
															}
														}
														else
															j--;
													}
												}
												else
													j--;
											}
										}
										else
											j--;
									}
								}
								else
									j--;
							}	
						}
						else
							j--;
					}
				}
			}
			System.out.println("Caso #"+numero+": "+cont);
			numero++;
		}
	}
}
