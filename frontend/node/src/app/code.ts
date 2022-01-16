/**        
 * 連想配列の型定義        
 */        
 export interface Map {        
    [index: string]: string;        
}        
        
/**        
 * 都道府県コードマスタ        
 */        
export const PREF_CODE_MAP: Map = {        
      1:"北海道"        
    , 2:"青森県"        
    , 3:"岩手県"        
}        
        
/**        
 * 性別コードマスタ        
 */        
export const GENDER_CODE_MAP: Map ={        
      M: "男性"        
    , F: "女性"        
}        
