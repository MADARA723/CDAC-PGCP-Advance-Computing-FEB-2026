import MyFunction from "./myFunction"

export const ErrorCatch = ({error}) => <h2>Runtime Error </h2>

    function ErrorHandler()
    {

        return <>
        <h1>Runtime Error demo</h1>
        <MyFunction  />
        </>
    }

    export default ErrorHandler;
