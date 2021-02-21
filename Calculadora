public class Calculadora {

    public Stack<Integer> stack;
    public String numeros=("0123456789");

    public String Calculo(String a)
    {
        stack = new StackVector<Integer>();

        try
        {
            for (int i=0; i<a.length(); i++)
            {
                char caracter = a.charAt(i);//obtiene el caracter

                //comparar si es un numero o un operador
                if(numeros.contains(String.valueOf(caracter))) //si es un numero
                {
                    stack.push(Character.getNumericValue(caracter)); //se guarda en el stack

                }
                else
                {
                    if(!stack.empty())
                    {
                        int num1=stack.pop();
                        int num2=stack.pop();

                        switch (caracter)
                        {
                            case '+':
                                //stack.pop();
                                stack.push(num1 + num2);
                                break;
                            case '-':
                                //stack.pop();
                                stack.push(num1 - num2);
                                break;
                            case '*':
                                //stack.pop();
                                stack.push(num1 * num2);
                                break;
                            case '/':
                                //stack.pop();
                                stack.push(num1 / num2);
                                break;
                            default:
                                System.out.println("A ocurrido un error en el ingreso de datos");
                                System.out.println("Porfavor no divida dentro de 0");

                        }
                    }
                }
            }

        }catch (Exception e)
        {
            System.out.println("No se pudo realizar el calulo por error: "+ e);
        }

        String resultado= String.valueOf(stack.peek()) ;
        return resultado;
    }


}
