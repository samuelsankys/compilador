

public class Scanner{
    private char currentChar =  // first source charactere

    private byte currentKind;
    private StringBuffer currentSpelling;

    private void take(char expectedChar){
        if(currentChar == expectedChar){
            currentSpelling.append(currentChar);
            currentChar = // next source Charactere

        }else{
            // report error
        }
    }

    private void takeIt(){
        currentSpelling.append(currentChar);
        currentChar = // next source character
    }

    private boolean isDigit(char c){
        // returns true iff the character c is a digit
    }

    private boolean isLetter(char c){
        // Returns true iff the character c is a letter
    }

    private boolean isGraphic(char c){
        // 
    }

    private byte scanToken(){
         // as above
    }

    public Token scan(){
        while(currentChar == ' ' || currentChar == '\n')   // no livro tem o separador !
            scanSeparator();
        currentSpelling = new StringBuffer("");
        currentKind = scanToken();

        return new Token(currentKind, currentSpelling.toString());
    }




private byte  scanToken(){

            switch (currentChar){

                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    takeIt();
                    while (isLetter(currentChar) || isDigit(currentChar)){
                        takeIt();
                    }
                    return Token.IDENTIFICADOR;

                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    takeIt();
                    while (isDigit(currentChar)){
                        takeIt();
                    }
                    return Token.NUMEROS;

                case '+':
                case '-':
                case '*':
                case '/':
                case '=':
                case '<':
                case '>':
                case '\\':
                case '&':
                case '@':
                case '%':
                case '^':
                case '?':
                    takeIt();
                    while (isOperator(currentChar)){
                        takeIt();
                    }
                    return Token.OPERADOR;

                /*case '\'':
                    TakeIt();
                    TakeIt(); // the quoted character
                    if (_source.Current == '\'')
                    {
                        TakeIt();
                        return TokenKind.CharLiteral;
                    }
                    return TokenKind.Error; */

                case '.':
                    takeIt();
                    return Token.PONTO;

                case ':':
                    takeIt();
                    if (currentChar == '='){
                        takeIt();
                        return Token.BECOMES;
                    }
                    return Token.DOISPONTOS;

                case ';':
                    takeIt();
                    return Token.PONTOVIRGULA;

                case ',':
                    takeIt();
                    return Token.VIRGULA;

                case '(':
                    takeIt();
                    return Token.LPARENT;

                case ')':
                    takeIt();
                    return Token.RPARENT;

                case '[':
                    takeIt();
                    return Token.LCOLCHETE;

                case ']':
                    takeIt();
                    return Token.RCOLCHETE;

               /* case '{':
                    takeIt();
                    return Token.LCHAVE;

                case '}':
                    takeIt();
                    return Token.RCHAVE;
                    */

                case '\000':
                    return Token.EOT;

                default:
                    takeIt();
                    return Token.Error;
            }
        }

        bool isLetter(int ch){
            return ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
        }

        bool isDigit(int ch){
            return '0' <= ch && ch <= '9';
        }

        bool isOperator(int ch){
            switch (ch){
                case '+':
                case '-':
                case '*':
                case '/':
                case '=':
                case '<':
                case '>':
                case '\\':
                case '&':
                case '@':
                case '%':
                case '^':
                case '?':
                    return true;

                default:
                    return false;
            }
        }

    private void scanSeparator(){
        switch(currentChar){
            case '!' : {
                takeIt();
                while( isGraphic(currentChar) ){
                    takeIt();
                }
                take('\n');
            }
            break;

            case ' ': case '\n':
                takeIt();
                break;




        }
    }



    }
