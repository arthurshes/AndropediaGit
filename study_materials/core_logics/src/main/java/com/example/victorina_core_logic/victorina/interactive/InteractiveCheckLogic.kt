package com.example.victorina_core_logic.victorina.interactive

class InteractiveCheckLogic {

   suspend fun checkCodeInteractive(answerCode:Int,currectCode:Int,answerFun:((Boolean)->Unit)){
      if (answerCode==currectCode){
          answerFun.invoke(true)
      } else{
          answerFun.invoke(false)
      }
    }

}