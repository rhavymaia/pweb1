import React from 'react'
import Footer from './components/Footer'
import Header from './components/Header'
import Main from './components/Main'

const App = () => {
  return (
    <div>
      <Header 
        logoImg='./ifpb.png' 
        logoName='IFPB'>
          Meu conteúdo!
      </Header>
      <Main></Main>
      <Footer></Footer>
    </div>
  )
}

export default App