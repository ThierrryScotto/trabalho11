programa 
	declara
		salario: real
		tempo: inteiro
		nome: texto
		aumento: real
		novo_salario: real

	define
		Calcula_aumento (valor, tempo) {
			declara
				a: real	
			executa
				se tempo > 10 entao 
					a := 1000
				senao 
					a := 500
				fimse
				retorna a
		}

	executa
		nome := "Ciclano Bentolato"
		salario := 5600
		tempo := 5
		aumento := Calcula_aumento (valor,tempo)
		novo_salario := novo_salario + aumento
		imprime ("Novo salario de " & nome & " e " & novo_salario)
fimprograma