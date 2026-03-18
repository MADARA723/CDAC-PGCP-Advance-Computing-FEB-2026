
import './App.css';
import Ispalindrome from './IsPalindrome';
import InputBtn from './InputBtn';
import Addition from './Add';

function App() {
  return (
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>
    <div>
    <Ispalindrome></Ispalindrome>
     <InputBtn></InputBtn> 
     <h2><Addition num1={12} num2={25}></Addition></h2> 
    </div>
  );
}

export default App;
