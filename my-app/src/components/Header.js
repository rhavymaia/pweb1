import React from 'react'
import Nav from './Nav'

const Header = ({logoImg, logoName, children}) => {

  return (
    <header>
      <img src={logoImg} alt={logoName}/>
      <Nav></Nav>
    </header>
  )
}

export default Header