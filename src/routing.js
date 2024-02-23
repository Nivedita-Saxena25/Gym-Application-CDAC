import React from 'react';
import {createBrowserRouter} from "react-router-dom";
  import App from './component/App';
  import Users from './component/Users';
  import Home from './component/Home';
  import Register from './component/Register';
  import Update from './component/Update';

  const customRouter = createBrowserRouter([
    {
        path: '/',
        element:<App/>,
        children:[{

          path:'/user',
          element:<Users/>
        },
      {
        path:'/home',
        element:<Home/>
      },
      {
        path:'/register',
        element:<Register/>
      },
      {
        path:'/update',
        element:<Update/>
      },]
    }
  ]);


  export default customRouter;