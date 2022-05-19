import React, { useState } from 'react';

const Main = () => {
  const [contador, setContador] = useState(0);

  function handleClick() {
    setContador(contador + 1);
    console.log('O valor do contador e:' + contador);
  }

  return (
    <main>
      <h1>{contador}</h1>
      <button onClick={handleClick}>Enviar</button>
    </main>
  );
};

export default Main;
