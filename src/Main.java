public class Main {
    public static void main(String[] args) {

        Questao[] quiz = new Questao[15];

        quiz[0] = new Questao();
        quiz[0].pergunta = "1) Qual é a função do comando 'for' na programação?";
        quiz[0].opcaoA = "A) Declarar variáveis";
        quiz[0].opcaoB = "B) Repetir um bloco de código";
        quiz[0].opcaoC = "C) Finalizar o programa";
        quiz[0].opcaoD = "D) Ler arquivos";
        quiz[0].opcaoE = "E) Compilar o código";
        quiz[0].correta = "B";

        quiz[1] = new Questao();
        quiz[1].pergunta = "2) Qual destes é um tipo primitivo em Java?";
        quiz[1].opcaoA = "A) String";
        quiz[1].opcaoB = "B) Integer";
        quiz[1].opcaoC = "C) boolean";
        quiz[1].opcaoD = "D) Scanner";
        quiz[1].opcaoE = "E) System";
        quiz[1].correta = "C";

        quiz[2] = new Questao();
        quiz[2].pergunta = "3) O que significa IDE?";
        quiz[2].opcaoA = "A) Integrated Development Environment";
        quiz[2].opcaoB = "B) Internal Data Execution";
        quiz[2].opcaoC = "C) Internet Development Engine";
        quiz[2].opcaoD = "D) Input Device Error";
        quiz[2].opcaoE = "E) Inter Data Emulator";
        quiz[2].correta = "A";

        quiz[3] = new Questao();
        quiz[3].pergunta = "4) Qual símbolo é usado para indicar comentários de linha em Java?";
        quiz[3].opcaoA = "A) #";
        quiz[3].opcaoB = "B) //";
        quiz[3].opcaoC = "C) /*";
        quiz[3].opcaoD = "D) --";
        quiz[3].opcaoE = "E) @@";
        quiz[3].correta = "B";

        quiz[4] = new Questao();
        quiz[4].pergunta = "5) Qual palavra-chave define uma constante em Java?";
        quiz[4].opcaoA = "A) static";
        quiz[4].opcaoB = "B) var";
        quiz[4].opcaoC = "C) const";
        quiz[4].opcaoD = "D) final";
        quiz[4].opcaoE = "E) immutable";
        quiz[4].correta = "D";

        quiz[5] = new Questao();
        quiz[5].pergunta = "6) Qual é a saída: System.out.println(5 + \"5\"); ?";
        quiz[5].opcaoA = "A) 10";
        quiz[5].opcaoB = "B) 55";
        quiz[5].opcaoC = "C) Erro";
        quiz[5].opcaoD = "D) 5 + 5";
        quiz[5].opcaoE = "E) Null";
        quiz[5].correta = "B";

        quiz[6] = new Questao();
        quiz[6].pergunta = "7) Qual é o operador lógico 'E' (AND) em Java?";
        quiz[6].opcaoA = "A) &";
        quiz[6].opcaoB = "B) &&";
        quiz[6].opcaoC = "C) ||";
        quiz[6].opcaoD = "D) ==";
        quiz[6].opcaoE = "E) !";
        quiz[6].correta = "B";

        quiz[7] = new Questao();
        quiz[7].pergunta = "8) Qual estrutura representa um array em Java?";
        quiz[7].opcaoA = "A) ()";
        quiz[7].opcaoB = "B) {}";
        quiz[7].opcaoC = "C) <>";
        quiz[7].opcaoD = "D) []";
        quiz[7].opcaoE = "E) //";
        quiz[7].correta = "D";

        quiz[8] = new Questao();
        quiz[8].pergunta = "9) Qual método é executado primeiro em um programa Java?";
        quiz[8].opcaoA = "A) start()";
        quiz[8].opcaoB = "B) init()";
        quiz[8].opcaoC = "C) main()";
        quiz[8].opcaoD = "D) run()";
        quiz[8].opcaoE = "E) execute()";
        quiz[8].correta = "C";

        quiz[9] = new Questao();
        quiz[9].pergunta = "10) Qual tipo armazena números com casas decimais em Java?";
        quiz[9].opcaoA = "A) int";
        quiz[9].opcaoB = "B) boolean";
        quiz[9].opcaoC = "C) char";
        quiz[9].opcaoD = "D) double";
        quiz[9].opcaoE = "E) long";
        quiz[9].correta = "D";

        quiz[10] = new Questao();
        quiz[10].pergunta = "11) Qual destas palavras-chave cria um objeto?";
        quiz[10].opcaoA = "A) object";
        quiz[10].opcaoB = "B) build";
        quiz[10].opcaoC = "C) new";
        quiz[10].opcaoD = "D) instance";
        quiz[10].opcaoE = "E) make";
        quiz[10].correta = "C";

        quiz[11] = new Questao();
        quiz[11].pergunta = "12) O que significa OOP?";
        quiz[11].opcaoA = "A) Object Oriented Programming";
        quiz[11].opcaoB = "B) Open Operation Protocol";
        quiz[11].opcaoC = "C) Order Of Processes";
        quiz[11].opcaoD = "D) Output Oriented Program";
        quiz[11].opcaoE = "E) Optional Object Process";
        quiz[11].correta = "A";

        quiz[12] = new Questao();
        quiz[12].pergunta = "13) Qual comando imprime algo na tela em Java?";
        quiz[12].opcaoA = "A) echo()";
        quiz[12].opcaoB = "B) write()";
        quiz[12].opcaoC = "C) System.out.println()";
        quiz[12].opcaoD = "D) show()";
        quiz[12].opcaoE = "E) printline()";
        quiz[12].correta = "C";

        quiz[13] = new Questao();
        quiz[13].pergunta = "14) Qual estrutura é usada para tomar decisões?";
        quiz[13].opcaoA = "A) for";
        quiz[13].opcaoB = "B) while";
        quiz[13].opcaoC = "C) if";
        quiz[13].opcaoD = "D) switch";
        quiz[13].opcaoE = "E) Ambas C e D estão corretas";
        quiz[13].correta = "E";

        quiz[14] = new Questao();
        quiz[14].pergunta = "15) Em Java, qual modificador torna um atributo privado?";
        quiz[14].opcaoA = "A) public";
        quiz[14].opcaoB = "B) hidden";
        quiz[14].opcaoC = "C) private";
        quiz[14].opcaoD = "D) protect";
        quiz[14].opcaoE = "E) secret";
        quiz[14].correta = "C";

        int acertos = 0;

        for (Questao q : quiz) {
            q.escrevaQuestao();
            String resp = q.leiaResposta();
            if (q.isCorreta(resp)) {
                acertos++;
            }
        }

        int total = quiz.length;
        double porcentagem = (acertos * 100.0) / total;

        System.out.println("Acertos: " + acertos + " de " + total);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
    }
}
