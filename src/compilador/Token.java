/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

public class Token {
    public byte kind; //tipo
    public String spelling;
    
    public Token (byte kind, String spelling){
        this.kind = kind;
        this.spelling = spelling;
    }
    
    public final static byte
                        
                + = ,
                - =,
                * =,
                / =,
                AND =,
                ARRAY = 16,
                BECOMES = 6, // :=
                BEGIN = 0,
                BOOLEAN =,
                DIFERENTE =,
                DO = 17,
                DOISPONTOS = 21,
                ELSE = 3,
                END = 8,
                EOT = 22;
                FALSE=,
                IDENTIFICADOR = 18, // alfabeto
                IF = 1,
                IGUAL =,
                INTEGER =,
                LCOLCHETE = 13, // [
                LPARENT = 10,
                MAIORIGUAL =,
                MAIORQ=,
                MENORIGUAL =,
                MENORQ=
                NUMEROS = 5, // int literal do livro
                OF = 15,
                OPERADOR = 12, // são todos os sinais de operações. + - * / < > = \\
                or =
                OUTROS =
                PONTO=
                PONTOVIRGULA = 20,
                PROGRAM = 19,
                RCOLCHETE = 14, // ]
                REAL =
                RPARENT =11,
                THEN = 2,
                TRUE =
                VAR = 4,
                VIRGULA=
                WHILE = 9,



}
