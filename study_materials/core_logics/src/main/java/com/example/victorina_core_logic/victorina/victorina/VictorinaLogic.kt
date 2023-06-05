package com.example.victorina_core_logic.victorina.victorina

class VictorinaLogic {

   suspend fun checkOtvet(victorinaStates: VictorinaStates, getAnswer:((Boolean)->Unit)){
        when(victorinaStates){
            VictorinaStates.CURRECT_ANSWER -> {
                getAnswer.invoke(true)
            }
            VictorinaStates.INCURRECT_ANSWER -> {
                getAnswer.invoke(false)
            }
        }
    }



}