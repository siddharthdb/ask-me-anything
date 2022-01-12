import React from "react";
import './_shared.scss';

const Header = () => {
  return (
    <header>
      <a href="#default" class="logo">
        CompanyLogo
      </a>
      <div class="header-right">
        <a class="active" href="#home">
          Home
        </a>
        <a href="#contact">Contact</a>
        <a href="#about">About</a>
      </div>
    </header>
  );
};

export default Header;
