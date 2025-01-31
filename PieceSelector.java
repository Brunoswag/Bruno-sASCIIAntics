

import Enums.CornerPreference;
import Enums.Pieces;

/**
 *
 * @author bruno
 */
public class PieceSelector
{
    // Vertical, Horizontal, top left, top right, bottom left, bottom right, left T inter, right T inter, top T inter, bottom T inter, 4 way inter
    private static String[] blank =             {"","","","","","","","","","",""};
    private static String[] fancy =             {"│","─","┌","┐","└","┘","├","┤","┬","┴","┼"};
    private static String[] fancy_heavy =       {"","","","","","","","","","",""};
    private static String[] curved =            {"","","","","","","","","","",""};
    private static String[] fancy_double_line = {"","","","","","","","","","",""};
    private static String[] basic =             {"|","-","+","+","+","+","+","+","+","+","+"};
    
    
    public static String getPiece(CornerPreference pref, Pieces piece)
    {
        int pieceNumber = -1;
        switch (piece)
        {
            case VERTICAL:             pieceNumber =  0; break;
            case HORIZONTAL:           pieceNumber =  1; break;
            case TOP_LEFT_CORNER:      pieceNumber =  2; break;
            case TOP_RIGHT_CORNER:     pieceNumber =  3; break;
            case BOTTOM_LEFT_CORNER:   pieceNumber =  4; break;
            case BOTTOM_RIGHT_CORNER:  pieceNumber =  5; break;
            case LEFT_T_INTERSECTION:  pieceNumber =  6; break;
            case RIGHt_T_INTERSECTION: pieceNumber =  7; break;
            case TOP_T_INTERSECTION:   pieceNumber =  8; break;
            case BOTTOM_T_INTERSECTION:pieceNumber =  9; break;
            case ALL_WAY_INTERSECTION: pieceNumber = 10; break;
            default: break; //Create an error system: should it throw error or print error char
        }
        
        
//        if(null != pref)
//        return switch(pref)
//        {
//            case FANCY -> { return fancy[pieceNumber]; }
//            case BASIC -> basic[pieceNumber];
//        }
        switch (pref)
        {
            case FANCY:             return fancy             [pieceNumber];
            case FANCY_HEAVY:       return fancy_heavy       [pieceNumber];
            case CURVED:            return curved            [pieceNumber];
            case FANCY_DOUBLE_LINE: return fancy_double_line [pieceNumber];
            case BASIC:             return basic             [pieceNumber];
            
            default:                return blank[pieceNumber];
        }
        
    }
}
