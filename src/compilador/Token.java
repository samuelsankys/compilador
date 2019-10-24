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
            BEGIN = 0,
            IF = 1,
            THEN = 2,
            ELSE = 3,
            VAR = 4,
            INTLITERAL = 5,
            BECOMES = 6,        // :=
            BOOLEANLITERAL = 7,
            END = 8,
            WHILE = 9,
            LPARENT = 10,
            RPARENT =11,
            OPERADOR = 12,
            LCOLCHETE = 13,        // [
            RCOLCHETE = 14,       // ]
            OF = 15,
            ARRAY = 16,
            DO = 17,
            IDENTIFICADOR = 18,
            PROGRAM = 19,
            PONTOVIRGULA = 20,
            DOISPONTOS = 21,
            EOT = 22;
            
}
