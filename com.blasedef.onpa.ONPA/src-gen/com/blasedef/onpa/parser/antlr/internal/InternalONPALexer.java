package com.blasedef.onpa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalONPALexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int RULE_INACTIVECOMPONENT=8;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_UPPER=7;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_LOWER=4;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int RULE_INT=5;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalONPALexer() {;} 
    public InternalONPALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalONPALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:11:7: ( ';' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:12:7: ( '*' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:12:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:13:7: ( '[' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:14:7: ( ']' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:15:7: ( '{' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:16:7: ( '}' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:17:7: ( '=' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:18:7: ( '(' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:19:7: ( ')' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:20:7: ( '<' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:21:7: ( '>' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:22:7: ( '||' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:22:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:23:7: ( '&&' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:23:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:24:7: ( '==' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:24:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:25:7: ( '!=' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:25:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:26:7: ( '>=' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:26:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:27:7: ( '<=' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:27:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:28:7: ( '-' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:29:7: ( '+' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:30:7: ( '/' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:30:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:31:7: ( '!' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:31:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:32:7: ( 'true' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:32:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:33:7: ( 'false' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:33:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:34:7: ( '.' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:35:7: ( 'e' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:35:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:36:7: ( 'E' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:36:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_LOWER"
    public final void mRULE_LOWER() throws RecognitionException {
        try {
            int _type = RULE_LOWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1680:12: ( ( 'a' .. 'z' )+ ( RULE_ID )? )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1680:14: ( 'a' .. 'z' )+ ( RULE_ID )?
            {
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1680:14: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1680:15: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1680:26: ( RULE_ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='^' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='z')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1680:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER"

    // $ANTLR start "RULE_UPPER"
    public final void mRULE_UPPER() throws RecognitionException {
        try {
            int _type = RULE_UPPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1682:12: ( ( 'A' .. 'Z' )+ ( RULE_ID )? )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1682:14: ( 'A' .. 'Z' )+ ( RULE_ID )?
            {
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1682:14: ( 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1682:15: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1682:26: ( RULE_ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1682:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPPER"

    // $ANTLR start "RULE_INACTIVECOMPONENT"
    public final void mRULE_INACTIVECOMPONENT() throws RecognitionException {
        try {
            int _type = RULE_INACTIVECOMPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1684:24: ( 'InactiveComponent' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1684:26: 'InactiveComponent'
            {
            match("InactiveComponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INACTIVECOMPONENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1686:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1686:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1686:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1686:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1686:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1688:10: ( ( '0' .. '9' )+ )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1688:12: ( '0' .. '9' )+
            {
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1688:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1688:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1690:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1692:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1692:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1692:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1692:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:41: ( '\\r' )? '\\n'
                    {
                    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1694:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1696:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1698:16: ( . )
            // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1698:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_LOWER | RULE_UPPER | RULE_INACTIVECOMPONENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=36;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:166: RULE_LOWER
                {
                mRULE_LOWER(); 

                }
                break;
            case 28 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:177: RULE_UPPER
                {
                mRULE_UPPER(); 

                }
                break;
            case 29 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:188: RULE_INACTIVECOMPONENT
                {
                mRULE_INACTIVECOMPONENT(); 

                }
                break;
            case 30 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:211: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:219: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:228: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:240: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:256: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:272: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../com.blasedef.onpa.ONPA/src-gen/com/blasedef/onpa/parser/antlr/internal/InternalONPA.g:1:280: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\7\uffff\1\50\2\uffff\1\54\1\56\2\40\1\62\2\uffff\1\67\2\71\1\uffff\1\77\1\102\1\71\2\100\1\40\2\uffff\2\40\31\uffff\1\71\1\uffff\2\71\1\uffff\1\71\3\uffff\1\100\1\uffff\2\100\3\uffff\5\71\4\100\1\124\1\71\1\100\1\uffff\1\127\1\100\1\uffff\14\100";
    static final String DFA16_eofS =
        "\144\uffff";
    static final String DFA16_minS =
        "\1\0\6\uffff\1\75\2\uffff\2\75\1\174\1\46\1\75\2\uffff\1\52\2\60\1\uffff\5\60\1\101\2\uffff\2\0\31\uffff\1\60\1\uffff\2\60\1\uffff\1\60\3\uffff\1\60\1\uffff\2\60\3\uffff\14\60\1\uffff\2\60\1\uffff\14\60";
    static final String DFA16_maxS =
        "\1\uffff\6\uffff\1\75\2\uffff\2\75\1\174\1\46\1\75\2\uffff\1\57\2\172\1\uffff\6\172\2\uffff\2\uffff\31\uffff\1\172\1\uffff\2\172\1\uffff\1\172\3\uffff\1\172\1\uffff\2\172\3\uffff\14\172\1\uffff\2\172\1\uffff\14\172";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\5\uffff\1\22\1\23\3\uffff\1\30\6\uffff\1\36\1\37\2\uffff\1\43\1\44\1\1\1\2\1\3\1\4\1\5\1\6\1\16\1\7\1\10\1\11\1\21\1\12\1\20\1\13\1\14\1\15\1\17\1\25\1\22\1\23\1\41\1\42\1\24\1\uffff\1\33\2\uffff\1\36\1\uffff\1\30\1\31\1\34\1\uffff\1\32\2\uffff\1\37\1\40\1\43\14\uffff\1\26\2\uffff\1\27\14\uffff";
    static final String DFA16_specialS =
        "\1\1\34\uffff\1\0\1\2\105\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\16\1\35\3\40\1\15\1\36\1\10\1\11\1\2\1\20\1\40\1\17\1\24\1\21\12\34\1\40\1\1\1\12\1\7\1\13\2\40\4\31\1\26\3\31\1\30\21\31\1\3\1\40\1\4\1\32\1\33\1\40\4\27\1\25\1\23\15\27\1\22\6\27\1\5\1\14\1\6\uff82\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "",
            "\1\53",
            "\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\65\4\uffff\1\66",
            "\12\74\7\uffff\32\73\4\uffff\1\73\1\uffff\21\72\1\70\10\72",
            "\12\74\7\uffff\32\73\4\uffff\1\73\1\uffff\1\75\31\72",
            "",
            "\12\74\7\uffff\32\73\3\uffff\1\71\1\73\1\uffff\32\72",
            "\12\74\7\uffff\32\101\3\uffff\1\100\1\103\1\uffff\32\103",
            "\12\74\7\uffff\32\73\4\uffff\1\73\1\uffff\32\72",
            "\12\74\7\uffff\32\101\4\uffff\1\103\1\uffff\15\103\1\104\14\103",
            "\12\74\7\uffff\32\101\4\uffff\1\103\1\uffff\32\103",
            "\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\0\106",
            "\0\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\113\7\uffff\32\112\4\uffff\1\112\1\uffff\24\111\1\110\5\111",
            "",
            "\12\113\7\uffff\32\112\4\uffff\1\112\1\uffff\32\111",
            "\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
            "",
            "\12\113\7\uffff\32\112\4\uffff\1\112\1\uffff\13\111\1\114\16\111",
            "",
            "",
            "",
            "\12\116\7\uffff\32\115\4\uffff\1\117\1\uffff\32\117",
            "",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\32\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\1\120\31\116",
            "",
            "",
            "",
            "\12\113\7\uffff\32\112\4\uffff\1\112\1\uffff\4\111\1\121\25\111",
            "\12\113\7\uffff\32\112\4\uffff\1\112\1\uffff\32\111",
            "\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
            "\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
            "\12\113\7\uffff\32\112\4\uffff\1\112\1\uffff\22\111\1\122\7\111",
            "\12\116\7\uffff\32\115\4\uffff\1\117\1\uffff\32\117",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\32\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\32\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\2\116\1\123\27\116",
            "\12\113\7\uffff\32\112\3\uffff\1\71\1\112\1\uffff\32\111",
            "\12\113\7\uffff\32\112\4\uffff\1\112\1\uffff\4\111\1\125\25\111",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\23\116\1\126\6\116",
            "",
            "\12\113\7\uffff\32\112\3\uffff\1\71\1\112\1\uffff\32\111",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\10\116\1\130\21\116",
            "",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\25\116\1\131\4\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\4\116\1\132\25\116",
            "\12\116\7\uffff\2\116\1\133\27\116\4\uffff\1\116\1\uffff\32\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\16\116\1\134\13\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\14\116\1\135\15\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\17\116\1\136\12\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\16\116\1\137\13\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\15\116\1\140\14\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\4\116\1\141\25\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\15\116\1\142\14\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\23\116\1\143\6\116",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\32\116"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_LOWER | RULE_UPPER | RULE_INACTIVECOMPONENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_29 = input.LA(1);

                        s = -1;
                        if ( ((LA16_29>='\u0000' && LA16_29<='\uFFFF')) ) {s = 70;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0==';') ) {s = 1;}

                        else if ( (LA16_0=='*') ) {s = 2;}

                        else if ( (LA16_0=='[') ) {s = 3;}

                        else if ( (LA16_0==']') ) {s = 4;}

                        else if ( (LA16_0=='{') ) {s = 5;}

                        else if ( (LA16_0=='}') ) {s = 6;}

                        else if ( (LA16_0=='=') ) {s = 7;}

                        else if ( (LA16_0=='(') ) {s = 8;}

                        else if ( (LA16_0==')') ) {s = 9;}

                        else if ( (LA16_0=='<') ) {s = 10;}

                        else if ( (LA16_0=='>') ) {s = 11;}

                        else if ( (LA16_0=='|') ) {s = 12;}

                        else if ( (LA16_0=='&') ) {s = 13;}

                        else if ( (LA16_0=='!') ) {s = 14;}

                        else if ( (LA16_0=='-') ) {s = 15;}

                        else if ( (LA16_0=='+') ) {s = 16;}

                        else if ( (LA16_0=='/') ) {s = 17;}

                        else if ( (LA16_0=='t') ) {s = 18;}

                        else if ( (LA16_0=='f') ) {s = 19;}

                        else if ( (LA16_0=='.') ) {s = 20;}

                        else if ( (LA16_0=='e') ) {s = 21;}

                        else if ( (LA16_0=='E') ) {s = 22;}

                        else if ( ((LA16_0>='a' && LA16_0<='d')||(LA16_0>='g' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='z')) ) {s = 23;}

                        else if ( (LA16_0=='I') ) {s = 24;}

                        else if ( ((LA16_0>='A' && LA16_0<='D')||(LA16_0>='F' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='Z')) ) {s = 25;}

                        else if ( (LA16_0=='^') ) {s = 26;}

                        else if ( (LA16_0=='_') ) {s = 27;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 28;}

                        else if ( (LA16_0=='\"') ) {s = 29;}

                        else if ( (LA16_0=='\'') ) {s = 30;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 31;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||LA16_0==','||LA16_0==':'||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 70;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}