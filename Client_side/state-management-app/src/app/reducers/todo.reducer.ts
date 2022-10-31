
import { ActionParent } from "../actions/todo.action";
import {Todo} from "../models/Todo";;


const initialState: Todo[] = [
    {title:"Todo 1"},
    {title:"todo 2"},
    {title: "todo 3"}
];

export function TodoReducer(state = initialState, action: ActionParent){
    switch(action.type) {
        default:return state;
    }
}
