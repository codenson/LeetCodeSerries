
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author guero
 */
public class MaximumNumberofBalloons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Count : " + maxNumberOfBalloons("balloonbalxpoonl"));//2   //184
        System.out.println("Count : " + maxNumberOfBalloons("ymrujjozekildighazuinydsoteblpqpxemdoyfjlfurwkimhwvaxvyewnrqnslqpqutcjzjmtrvksvdqdfeabgxrouyzhlpudpjpsykyrnovmlgdayuujvjwjlcwvsneuionljthzeklzcsfzccabwcvmadhiduzirmbtgqeuecottfkrueltsexpmuivfapmsxqifztoxgmzrnyhpiimlvgcclrtumlnvdncyxppwhnqcdmynetmwlknehsaafecaaieksczvtyzqausrwdsbgyiygkgfritokjrmvqtyesvsacddpztkseokmcmevhmjkwupdoxcwxhsplivolomvvekxdrwhnxtgmpwyhsnfjcqbufgpxozcdjpamsfjrqcgoxuvwyunmywfcmiwdhjweflnerfxkuaradoknfvplhfzthwaeqergwwkicadujidvdinydorcwmqilroxgoxmlybmlfdlepwdahhzjrsompsbhrzzuarrmofecqxvafhmpkchmkzrhmlyiqlpmbnsccqrdhwgligurjphlxeehfunbbozfzjsnlyrbyibysfoufitbvlpnpsbclkpaundpwnfskyrjlbewnvwutijmpgdphkeuphusbrsgszyazxdmuvmqjlaviiyrdjdpodshkgwgnmagzrvphwqizuouaxnarreieeofufivdwkkfivmfsjhxjqrlplbhagfjdtpqgzalwpscgxcwenjxsfcrxtzwlxninzcegirrncqkbgrlxdfndahrchgjmpyzwialdtjcxlordhbfarpfdtuwhdqjksmcfyuemqbmudaxhqhjwpqqelyqjdqoehutrrmamebcaagllueeogemgxocbttdlzhmvnierfemgzkfjqwicbjcjgnjsjdkemzledbhqwyygxobhtehwnpioodtupdjggopgcsecxqsibrbaeizoxgysnlimewfvgryiufzjrxizsluexmxdukhpgwufbzjwwlwnyhprrxmzzrvytgcmueevyqomcqzonzlazxynpditwoekcnwwejonkojbkfkofdhfcdkdxmafriprxzdmwntcjkyoifytfrxfdkdayteajsmihknsrddhvtjaliqyekfaqcnaohotckbvjdgedjmsfugvskhtpfdnpdnvdtgbwblbglyvnfrvdkgwubofnwwomftwqaflxflcapeozdjiuszahgyxinwvfdzcbpctvimobdqewqaylqeseblzjukbrdiuqphyylrsgshkhuepfogjftqvetchquqffyszjhlcvymptkimwpqlmaqwpyjalyclatmlrwunqxmfeydjixczjylaxxaevkyvxhbennzylffvpficqchngxijqdfmcbkdbisaiohaomsjdnyzyqorudrmzfbhakjyxjcyaornlzbmpqrygxdczasutdjdgykxtekumnjuyvsfdczncaruqijyxxfrhvupgjijnhqpehnocltxggkjcownhfrtlqochjikjdjtwndwqaewztirleubulzhrjfqzpchxnezldhzsiopmdsjwyzixuiyuqdflfkievsiwdzpoxgxxkojbzgdotzsijicylrvprpznrhzpknvzemsdpggychhdczmvffiehiiflhnvuuodzhxiggrbjwqqkflvibumjflhqjimoewmtwxniklnmfmkitxxafnvwsmjnbjiemduhqgctbvxcetkaisjgjqhnnwyeirxtctfrdgrabgkphufctgmkthwtynlnueihngkzosjhhpmramakhnkogwdhqebnvgjsmmrruuvbakdslusbglhbixegwpjhtpesjpshtmuxhakrgnwhgnptcjovgcqpetqzxuburdytheeiqwdyfgqvdqcugsjappmfnpbqioezdquqoxzmstumjmirptllzdwdhsstuhaiylizzkpopjhyjqzlmirzhlnzuqdgyrkfqsefhrlxxeqmzgjylufopokmdiqahgzcbkbdjhiwcuoqhmarswwxgevzghjocyvifwmixjgxmnydmzlxbnxejnhbsjqpxtgjgifjbkmygwkqolusdajzkknvkeiealzwbjomvymozqpvpgbeybsjapcewlvyqorhhaqfsnszboxsahhazifxfjnavubyrrubudkcfhzksvpdvphbcvmyuqafllmvpjdofvjrkmkgqugrxhofdnevqietkxpadwbehxlotjhwdkizyflzkyaifcjgsyndczvuxkdupxthpnzsgbktibowxkbclwnhlcsgrfjnlfxjunkakbdmrijzzuaefkrahvmbyrxqkjgruweonwuijznckqugfsbecatkhrqceqzdccisskxlmhxvgvcgbbsheolecdkntotypzwfnkyvezwpgwlptpsinhjmqhjseafoaicdwqertotylqxegeujnhugqoqxqprvhjisuzuvmumtckjdhewqwqaqfyqrnvqptqivdabnrbmymyehyucxuvwdrmbyqwdfvmpxoxufexiyqnxoeipeldtcunztqcwozzxfporhvxwsdlrrmwvaemirmvimetcquyijgviahxctivizfxhvrqtyjjxysmhxnayhazclykpgwaighdihilvfeggwenjatiombgvwcjwpqkoskulgqqusjmhygkjjyqymwzarmufllawgxzubzolykxqhwagxcsrcdfuralukwgtwgrtileacbktmzmhlfuafwefmhgdghkvujimoixqazweuxfdlxwwqkitbecedgblkqlbpqeyfegbynxhubzwjswfhuljzigzoitooeiwgtpwiddhfgsqcasvxmsevmxzaitaekqyprxzctywafejatznvdofeurzytgmyjkwvsgrtvogfduzohpehbbeobshuujegfojdkzhhcwqowbwvhhkgexwsjgrplkabqhzwipnvivnszezrylbvovmgyswmphflkuwmdcqegggowojaaislggdfbmuodhcomfimltwgredrejkpswobjgnwtlxogfpezgxekxymycsnjslpmwyhpwjjbjfaddpfvuctadlhfufokinuffucrloezhqaijhixysylkdalgphlpwsbwsuqugbwxgorcibepsionqeaxiderdnrafdhclcrabrzxaahirftttqimmwnqxdlzllwtiqtbitmwrhzklwnsmhhsasqebkaxtjssetrdazgbftvjnggdreqqohsqrsdyoognzezrqzbpthldnaiixcjimqthfzzosmfoiootztkhgehobvprnxulbrnvuunhviupyjzjszocgexmkbjgqfhknyjbodnhyglpnwwdmaqlehwvkufgoqzcgllcbjzfbtkrechjrryztlemgpwzppenerbdlopnveokevycsedfzhtueyeicnherzvyhwlpioumtcarwnhbagicfrfstmenphrtpsuxemogiyiqczdlgxvnhvftwnykljmdjqkpzplvehtmzkdsbahojludlxerydlqevuwiigpzapsrzjhsaajnjsctyxctnxgwaqogbyklrzoexcpjpwubyurjzpeyysxhxzobxxgbskvztyjxqxraestqdohfjsmsnokcpguvfozadkkqctwwksxfpfqcgixutpscbjqeunorubmjijcpwtazwehxwkcpbptentnbxqyeltfzoqiaxryshmpezqjrxqsyphiqojlcexfrcdiesgndzzazxustjtsnkjldpjzgmwbteeqmnfhcitjkufhlewljphaoiuhzxmiuvvafhvglckucivjsnijulcpsuxmihjcucpkvoswpsyesgfztmutogialkdkypfkxqytoweqcuombmskjpxwbyfqlixfjbxmrngdrymguzydbqemknzjxwwogpyavhpepthrougoeudhumeeltshtzgmszzjloanwjmelaqjdurvnixxvmjtyuypvpfubuhyxvrlgplmldberdcfrycegogxrfeolaccesjlutxbhlnqvsqccyduxcvubsfwdaoadcceadsinkxpvidftkptmzriwflyvokruohuoekorztkxorxrrjoqxhonmsjtwrclczkqmmadnigoawsuxzgneaaowrxvwdnbshbxfdwhwaqkequkghxzlofkgwzjazjmyijzwujccwzslgjrkzbsxeewwpzaikpcsxdlvzcczqlnqkovfsmhylmbazgcnbsntzhpjxygndndvxnbtuvixuopzapfbtpjoawawwwbjwzbvejszfqetnxjuwyzcralqjenchospjjahlcfvjvrjabvudunpehuviyxklydjhcshehcltlqhjtekjbiyqsvoviciwwewvzhobofnqnzdnvuyoaufwnqoekvmpozeeaqvdxuigocrmyzhpepbrcoofhfsqdxjyzgejanioyjlfilfaprwjzuzgpnafdrrlfmxfegqdzbmzpilfzmfjjhdqzyixybctbwfhxczzcagwxetygowqvkxlkdoagjhtzzvpjpzccznholbbqmxwmmwtgdtqgxsssrtddyxhkatffwvmfyraulcojadijgmjogxefwaehsgrcfefdimwignybiftwbfghhqegdolrhyocgkeblasiwfecwzshzulxvmigtsmtmlzzxmrdqzyceaayzgxbiuvcakppdztfptelfvegyzikasroecmitoeqzlowcpwlrpxwmffchmwkdhqyxtwbversklxezmukdfvbzfszauskczinhhcpurpatlfpvuyiznzvdqdkxegzmfijifjlpuqmmlwzbfskpmyfyvssinkcftucwppsimcsnluojylxmoxlpxsbtjdqursyalzjgzqltjboqgbksdflyqdgtuepnduaojypwtiyyhhvzeaposbtdudvhixunamxnmgtkciiwaezkzlbvlfkwtdzkbgvckzjwbwqilpapjkfudiyghgcyybaedqzjzwiechimgjbntiueanhknnuhvxmioksphoxmoykxgmcphoxjnpkbfrjbzrzcgevlbttxzhhlppraigshymnfyqwrauhyoflxrzwmshclyacibtuqyipeatzfbyxnnugfxqgckjpubacdugrshrpmnzexdzdklahvcleednosdfusddchtziswnhyjqtjyadstmniqywitfszcufbmhvgboyujdflqqrbyerimrlnbuzyypszhnozgeazzyyoezxzmuhghxskipbkiayodxbxvnzwdpktbcxdwlbjwlvglkeprugjkztgqjfvityobestambiwpngycgtjwvbwbcuafdhxahltztavpayqxyiuazpiippioavteiodzdgwmtzqvuhrfjgzsnzdofdmfmjrroqezucdmxkupntkcdzvapkpyomsvhtnuqjjcmlsldjiarlcdiizjbmqojzyrhhbgtaqxqwtteohwcmdqyaaepvnmduixtlisjvivlhozmaztjcoxvaltgliafzpkaczxsuhjletqtebktxiyshsfqlnvezsgurfnrpousmrugzcntmzngtixyjemfktxzotypjcstimcwxdwcpbpbxpsjxgudlnsrufmkebhukdwppjcviwzpjncfwatnkwxojvumxumcpspuduyarldusguaexfiaqvqfacxiofarxwpbqsrxahhzecvpywknotjymrkhtibcrkxvcpkdzyjjidwgeieomwsnbrcupavrhffjhdkbeojaujueazydezdlhiyjswtesdefdjcoxecrxkjmvswwsysgnqfvohowxjgqrxjofvfrkwkmhmkvwbbkhdukrnyxxjtenedbtjkebcolafdvprkgkplievnmrnswewmxbxstwzvalycmzhxrjdxhcmlqmuxqfbawsbeonocpwokgipnawnadvnwbvjvxnamahjgpdptlwxiduuokolxeuosuraedgspdygrqduvprepkeirvbbbmtcsodeqzppmyfkkpxdlzesnlbqjfahlghtopstzixfgjxomdxoldsjvtqydyeihrkdlpmqxerldetvrewlhkayntzuizzaxblvcpnsvwfwkzjszugavwtzzwaarvwytztzhsjsmzwwieovyznbuaidwgcaxxtwzdbcpdeqxznnjzunpudipvpwhbfduulfrhwsblyfnzdqyrktoimoqaalsuhkehweuukqyjkbpzarzhizqdfjcbcrgntqgqixrccwzioffssmxehabevuzvzjtiyfauvvyswffowkylyzgnkrjhfvmnspfsryqhjzssykamgqmkilmidtepxfnzuycnzvxpubffeiqtvoetbehhquszbryodsgzdpiamtozdqecffvndwsxfsvhwkqejjaiumfqnugukcsznngumeywhsltstbwuecebfspdowsehnynpvayyygdxdntpaqhscmevxlvxthvjhrgdjqhginlisgmbkskcsoxnkyniymcndswrygzybegqpwognyhxukbvresltnqgqdppeehqucawiglvpfdttcnqilygacyqoduiftrgegxxngobuxbluomqcrfplfswvguinaknmzcrbrihqzcfbkatocxjvmejlyewqiymuqqljxxfmyofdaetgipdgrtmjipqyektnqxooqhbimblydsqkzbhzgiweydfkioyymwvtvgkksgyajkbwzxkbdgrjlfwnbgizuakxjcxvdiqjgbxjzylginnwkypfxtpqwttadneakbfvwhhahpbjytxpehlymkadtezrjiyrnqijaichdeglzhjylevxbdbfovasydhwxbwczexxgieehfhoxgbelpqjnyslgvcfjqgrqagoozldoerrwfebqcjpprscxoaubwvtkozewmkatbvaxzchiartyuoesqemhjnuhldricobltovpxhkdmsjvzjpbojchjwxhhvvkwmwgiiahdprabtbhferasnfhdinscpwiywcemcqwvjujlgadebftjztzjhheedjwrwdktyrbdqqjgyaryypiziimeaufkyjfkdqkxywnpmpfcsemkotndqxuvlrnuzlqixfltbnjyjyqdxieairfoxyfujwpofiredrikfriagiohxwtwjrpregcdyzyewtnnvlpguontdpvjpzgewthgzylvbkvpklghkbvtbbgnapqsmucdiqohblvvzxdlcwtkxahljxdmfnqpdtxqrtjulhlstoazqtzpjsoqgzqqusjagrmcmqzfistdgxljjuttjwqwfblatjbxdkwhzcsvmrzrnrsjlcorkoywdwedazabpknpnyhitsbguuvjhjvjvccuonrlcoamojxykttarrhchwjkrwmajegrcnaldiqxwkujpyyyfrrmcfmwslwvyqnnoyccmbhfimzoqbfmbsueltfdlpulimbesitqngputaqnthtqagruilxdmwdrbkztqlhrrekemaaktbqfhgimuoypoyagfdjdqydhkzawuluuokfcxoybhddflnsyxpwjttnujuymzfcvlpezqwugiifvqsglsvondmlhvonujjdvuemutxyaaqiuvgxksjuyjthnarwydyhmgrtuhaqkqnwidbuxuitwwrhidprxxhxeewunmvebvmywnasbspfcharucqhhcfcxtmjfnkqjqlpqbnbvngmyennavqdppvnyfvjjpmnhdqypoflmtfqytzaoodbiilsybwjwmiugggnvckkgzfilewofywetjncnbtesnexrdnoemhlxkdobdriadcuoasfrkqmjifuyylqrulzqlafnprhtzmxabpxlhkazsvcwhdwczrceyupmpooglszaxvlumzvyowwqgkloabbqcpvpilalviuqwypitldlvackegitdvvpdfbqkqacofnbghltfqfuyuamfwliviywtdlufvrqgmsmvierrupqroqatvavawzzblyvorohhqbilyrhrdbezocdaeuiblgajcoqoqrdmzscnnvrbsgkzadfdumlmhumelhdghxmuktgthsiaoevezhswsxxyibvwrhxwbdmfgbxhsoqwmficlxvuyduqxzemljlvijlvxjjilasmyddivbhcjkyecagoohsdhnqyatkqhqtcxtjfbtrqzrsbhlxpnavpufifuyjpjfefawdhlkpjjottmujdyszdpvseggqcrbxtugziuotlcobajrahesidkjeceshyrbekocbudghpgjthryprkeyqwubsfzpcuafugrgknkvthvjewrfgahggwcvalrorbiprqobbzwaekffpsaikktrxtbvnfakirqvcbpepbxzcjcinbjtljzndchigeybiwwbxkdufnkpjufdsqecabguwprjcwbvsuviuaajdjzplrkudihgddjfcvxejxamxcjkkmuhjnfgdkcncwvvfclrwodxcixoiremvxfietrlofdfbmgxkgwdpoybtphrjagvymmptsfgvkigxusodaddthzwxgkzzieanwfnpmpyjssegfvoomvckjwjfrvoeaqcupegsbdjyjyndamcorgethcvkbhnilvcmftfcxuplngysskyjjyufjgvxqpicflsjvvpvufwawuixiwkkxwncaebqqjjijkotqsdwkateodfmwyqeuqlvilaftlglrykcmswuerkoosivbgfuzqdydkmbkvnnhayqxhsgyjxeofpkjgictmlwilgfdvuonovxvfowpfnwcrqhdtztsrpzmjmplzhbazfkhzyqhdomvhebkwnybaiqanamyaqkgvpwnblxytypnhfczcypdaemgyzjcdktnvhtkalayrcdfwvlucyistvtnfvdxtorscjljxaxyvlstpxdaxgawachuskanzynkfgtizsfkghcaoorvxgycuhldyaecovyxpxkteyljzfbihcnobkupqcomcuawpgwduykkykqicnhjzhwhuqpudrcfqqnmhwxtbgtcjayzaglhzwocwlpnsrthnkbahbjwqeeohrycdfdxyxsyjvcdpdbuttlgdgtbqnacvylrmcfftgekmxfjyvfsjntaaebxvdtvkpudledtkstcfobqxbmckljxwpumwfummocekoacxeazimdtvcgmiqqkyhdvbzajvnnxerktqmqqusnnbvthusmjdjivxfcukzvwdbewvvhgubuxmiemrkgoylrhzojgqfkupknctgxxudkpjvihimnfgwbypyqifkpbkuvrdlpmihnusrbnprloovlonrfxzwstacwbhsehnywxbvpqtpdgtvqaribsyhjdzulrudqefehevgofqebtveyzjubhiqmlwunhoomrogplihuutdbicstwovjuesdubdqkabbcwafjvbujepscfhqxmgjlvgrpipdmglcsvudmyxttjgnpvacseqxdpoiotagrvcxfgsorhalyyzpwhptivgmklxosjnfmeosucjewcyjakzsdnsqkvdpurztgniwmyiymgnemeymyelggyanklmrpewiogegyzeaidwsooozppvxojbqjpblntsiuupzvjbcyoqcsfgkbwtzxyasblfkusfcxopagzrcknjqxzcnviryqrkmzrvbqeuzcvwgcpjqburxqbcuhiinmixdbobjlnxfipgnxtlmtkssocxjxzwefzppzawmxwwwnijerwskvztkmlnnypcxflvkdpingbdvewejnwnbjpgtycdlklrwmpgvbardvbwleaukeydsxhlpwlasnaknlzjughppksonnqagiphyfhjzyhykdoiinoiymlzlybtpucbnedmeatbfesxphvmrtryat"));
        System.out.println("Count : " + maxNumberOfBalloons("nlaebolko")); //1

    }

    public static int maxNumberOfBalloons(String text) {

        int[] arr = new int[26];
        String s = "baloon";

        for (int i = 0; i < text.length(); i++) {
            if (s.contains(text.charAt(i) + "")) {
                arr[text.charAt(i) - 'a']++;

            }
        }
        int min = Math.min(
                Math.min(arr['b' - 'a'], arr['a' - 'a']),
                Math.min(arr['l' - 'a'] / 2, arr['o' - 'a'] / 2)
        );

        return min;

    }
//    public static int maxNumberOfBalloons(String text) {
//         HashMap <Character, Integer> map = new HashMap(); 
//         map.put('b', 0);
//         map.put('a', 0);
//         map.put('l', 0);
//         map.put('o', 0);
//         map.put('n', 0);
//         
//         int counter = 0; 
//         
//         for (int i = 0; i < text.length(); i++){
//             if (map.containsKey(text.charAt(i))){
//                 map.put(text.charAt(i), map.get(text.charAt(i)).intValue()+1);
//                 
//             
//             }
//    }
//         
//         System.out.println("Map: "+ map.toString());
//         
//             for (int i = 0; i < text.length(); i++){
//                 if (map.get('b')> 0 && map.get('a')> 0 && map.get('l')>1 && map.get('o')> 1 && map.get('n')> 0){
//                 
//                 map.put('b', map.get('b')-1); 
//                 map.put('a', map.get('a')-1); 
//                 map.put('l', map.get('l')-2); 
//                 map.put('o', map.get('o')-2); 
//                 map.put('n', map.get('n')-1); 
//                 counter ++; 
//                 }
//                 else {
//                 break; 
//                 }
//               
//             
//             }
//             
//             return counter; 
//         
//    
//    
//    }
//     public static int maxNumberOfBalloons(String text) {
//        int count = 0; 
//        int strLen = text.length()/7;
//        int hold = 0; 
//        HashMap <Character, Integer> map = new HashMap(); 
//        char [] arr   = text.toCharArray();
//        int len = text.length() *2; 
//        int charCount = 0; 
//        int charIndexHolder = 0; 
//
//
//        map.put('b', 1);
//        map.put('a', 1);
//        map.put('l', 2);
//        map.put('o', 2);
//        map.put('n', 1);
//        
//        for (int i = 0; i < arr.length  ; i++) {
//            char ch  = arr[i];
//            if (ch !='\0' ){
//                
//                 if (map.containsKey(ch) && map.get(ch)!= 0){
//                     if (charIndexHolder == 0){
//                         charIndexHolder = i; 
//                     
//                     }
//                       hold++; 
//                    map.put(ch, map.get(ch)-1); 
//                     arr[i]= '\0'; 
//                 
//                 }
//                
//            
//            }
//             if (hold  == 7){
//                 count ++; 
//                hold = 0;
//                i  = charIndexHolder; 
//                charIndexHolder = 0; 
//        map.put('b', 1);
//        map.put('a', 1);
//        map.put('l', 2);
//        map.put('o', 2);
//        map.put('n', 1);
////        i =0; 
//            
//            }
//             if (charCount >= len){
//                return count; 
//           
//            
//            }
//            charCount++; 
//        }
//        return count; 
//    }
//    
//    public static int maxNumberOfBalloons(String text) {
//        int count = 0; 
//        int strLen = text.length()/7;
//        int hold = 0; 
//        HashMap <Character, Integer> map = new HashMap(); 
//        char [] arr   = text.toCharArray();
//
//
//        map.put('b', 1);
//        map.put('a', 1);
//        map.put('l', 2);
//        map.put('o', 2);
//        map.put('n', 1);
//        
//        for (int i = 0; i < arr.length && hold < strLen ; i++) {
//            if (arr[i]!= '\0')
//            {
//
//            for (int j = 0; j < arr.length; j++) {
//                 
//                 //if (arr[j]!= '\0')
//                 {
//                char ch = text.charAt(j);
//                if (map.containsKey(ch) && map.get(ch)!= 0) {
//                    hold++; 
//           
//                    map.put(ch, map.get(ch)-1); 
//               
//
//                  arr[j]= '\0'; 
//
//                }
//                    
//
//                }
//            }
//
//            if (hold == 7 ){
//                count ++; 
//                hold = 0; 
//        map.put('b', 1);
//        map.put('a', 1);
//        map.put('l', 2);
//        map.put('o', 2);
//        map.put('n', 1);
//            }
//            }
//
//        }
//        return count; 
//    }

}
