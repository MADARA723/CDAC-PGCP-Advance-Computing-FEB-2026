
import './App.css';

import { ErrorBoundary }
    from "react-error-boundary";
import MyFunction from './myFunction';
import Function2 from './Function2';
import ErrorHandler, { ErrorCatch } from './ErrorHandler';
import CallBackPrev from './PrevCall'
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from './home.js'
import About from './about.js'
import ColorPage from './colorPage'

function App() {
  return (
     <div className="App">
    
<CallBackPrev />

  <ErrorBoundary FallbackComponent={ErrorCatch}>
            <MyFunction></MyFunction>
   </ErrorBoundary>
      <Function2></Function2>
       <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
      </Routes>
    </BrowserRouter>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<ColorPage color="cyan" />} />
        <Route path="/red" element={<ColorPage color="red" />} />
        <Route path="/yellow" element={<ColorPage color="yellow" />} />
        <Route path="/green" element={<ColorPage color="green" />} />
        <Route path="/blue" element={<ColorPage color="blue" />} />
        <Route path="/orange" element={<ColorPage color="orange" />} />
      </Routes>
    </BrowserRouter>
  
    </div>
  );
}

export default App;
