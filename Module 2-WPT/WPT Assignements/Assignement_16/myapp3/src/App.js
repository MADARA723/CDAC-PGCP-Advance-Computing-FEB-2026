
import './App.css';
import CounterFunc from './CounterFunc';
import DropDown from './DataDropD';
import Parent from './Parent';
import FuncLife from './FuncLifeUseE';
import ShopStock from './ReadShopStock';

function App() {
  console.log(ShopStock);
  return (
    
    <div>
       <CounterFunc /> 
       <h1>=============================================================</h1>
      <DropDown />
      <h1>==============================================================</h1>
       <Parent /> 
       <h1>==============================================================</h1>
        {/* <FuncLife />     */}
        <h1>===============================================================</h1>

        <ShopStock /> 
        <h1>================================================================</h1>
       
      </div>
  );
}

export default App;
