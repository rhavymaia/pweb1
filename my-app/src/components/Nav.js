import React from 'react';

const Nav = () => {
  let itens = ['Home', 'About', 'Equipe'];

  return (
    <nav>
      <ul>
        {itens.map((item) => (
          <li>{item}</li>
        ))}
      </ul>
    </nav>
  );
};

export default Nav;
