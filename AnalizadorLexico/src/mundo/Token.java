/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad del Quind�o (Armenia - Colombia)
 * Programa de Ingenier�a de Sistemas y Computaci�n
 *
 * Asignatura: Teor�a de Lenguajes Formales
 * Ejercicio: AnalizadorLexico
 * Dise�o original por: Leonardo A. Hern�ndez R. - Agosto 2008 - Marzo 2009
 * Modificado y usado por: Claudia E. Quiceno R- Julio 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

/**
 * Clase que modela un token
 */

public class Token {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Constantes para modelar los posibles tipos de token que se van a analizar
     */
    final public static String ENTERO = "Entero";
    final public static String REAL = "Real";
    final public static String OPERADORARITMETICO = "Operador aritmetico";
    final public static String OPERADORASIGNACION = "Operador de asignaci�n";
    final public static String OPERADORLOGICO = "Operador l�gico";
    final public static String OPERADORRELACIONAL = "Operador relacional";
    final public static String SIMBOLOAPERTURA = "Simbolo de apertura";
    final public static String SIMBOLOCIERRE = "Simbolo de cierre";
    final public static String SEPARADORSENTENCIA = "Separador de sentencia";
    final public static String PALABRARESEVADACICLO = "Palabra reservada para un ciclo";
    final public static String PALABRARESEVADADESICION = "Palabra reservada para una desicion";
    final public static String PALABRARESEVADACLASE = "Palabra reservada para una clase";
    final public static String PALABRARESEVADAENTEROS = "Palabra reservada para tipo de datos enteros";
    final public static String PALABRARESEVADAREALES = "Palabra reservada para tipo de datos reales";
    final public static String PALABRARESEVADACADENAS = "Palabra reservada para una cadena";
    final public static String PALABRARESEVADACARACTERES = "Palabra reservada para un caracter";
    final public static String PALABRARESEVADANOMBREVARIABLES = "Palabra reservada para el nombre de una variable";
    final public static String PALABRARESEVADANOMBREMETODO = "Palabra reservada para el nombre de un metodo";
    final public static String PALABRARESEVADANOMBRECLASE = "Palabra reservada para el nombre de una clase";
    final public static String PALABRARESEVADAPROCEDIMIENTO = "Palabra reservada sin categoria para un procedimiento";
    final public static String PALABRARESEVADAMETODO = "Palabra reservada sin categoria para un metodo";
    final public static String PALABRARESEVADACONSTANTES = "Palabra reservada sin categoria para una constante";
    final public static String PALABRARESEVADAVARIABLES = "Palabra reservada sin categoria para una variable";
    final public static String IDENTIFICADOR = "Identificador";
    final public static String NORECONOCIDO = "No reconocido";
 //
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Lexema
     */
    private String lexema;

    /**
     * tipo
     */
    private String tipo;

    /**
     * posici�n del siguiente lexema
     */
    private int indiceSiguiente;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    /**
     * Constructor de un token
     * @param elLexema - cadena - laCadena != null
     * @param elTipo - tipo del token - elTipo != null
     * @param elIndiceSiguiente - posici�n del siguiente token - laPosicionSiguiente > 0
     */
    public Token( String elLexema, String elTipo, int elIndiceSiguiente )
    {
        lexema = elLexema;
        tipo = elTipo;
        indiceSiguiente = elIndiceSiguiente;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Entrega la informaci�n del token
     * @return Descripci�n del token
     */
    public String darDescripcion( )
    {
        return "Token: " + lexema + "     Tipo: " + tipo + "     �ndice del siguiente: " + indiceSiguiente;
    }

    /**
     * M�todo que retorna el lexema del token
     * @return el lexema del token
     */
    public String darLexema( )
    {
        return lexema;
    }

    /**
     * M�todo que retorna la posici�n del siguiente lexema
     * @return posici�n del siguiente token
     */
    public int darIndiceSiguiente( )
    {
        return indiceSiguiente;
    }

    /**
     * M�todo que retorna el tipo del token
     * @return el tipo del token
     */
    public String darTipo( )
    {
        return tipo;
    }




}
