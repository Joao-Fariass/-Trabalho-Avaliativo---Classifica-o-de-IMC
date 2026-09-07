void main () {
    String nome = IO.readln("Informe seu nome: ");
    char genero = IO.readln("Informe seu genêro (M: Masculino, F: feminino, N: Prefiro não informar): ").charAt(0);
    double altura = Double.parseDouble(IO.readln("Informe sua Altura: (em metros, ex: 1.75): "));
    double peso = Double.parseDouble(IO.readln("Informe seu Peso (em Kg, ex: 70.5): "));
    
    double imc = calcularIMC(peso, altura);
    String classificacao = "";

    switch (genero) {
        case 'M':
        case 'm':
            if (imc >= 40) {
                classificacao = "Obesidade Mórbida";
            } else if (imc >=30) {
                classificacao = "Obesidade Moderada";
            } else if (imc >=25) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
            break;

        case 'F':
        case 'f':
        case 'N':
        case 'n':
        default:
            if (imc >=39) {
                classificacao = "Obesidade Mórbita";
            } else if (imc >=29) {
                classificacao = "Obesidade Moderada";
            } else if (imc >=24) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
            break; 
            
    }
    
    IO.println("");
    IO.println("Nome: " + nome);
    IO.println("Gênero: " + genero);
    IO.println("IMC: " + imc);
    IO.println("Classificação: " + classificacao);
}

double calcularIMC(double peso, double altura) {
    return  peso / (altura * altura);

}