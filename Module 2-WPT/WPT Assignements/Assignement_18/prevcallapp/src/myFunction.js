import {useEffect} from 'react';

function MyFunction()
{
    useEffect(()=>{
        throw new Error("Something went Wrong");
    })

    return <>
    <h1>Function</h1>
    </>
}

export default MyFunction;