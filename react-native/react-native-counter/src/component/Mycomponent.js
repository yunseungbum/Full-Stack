import React from "react";
import { Pressable, Text } from "react-native";
import PropTypes from "prop-types";

const MyButton = ({ title = 'button', name, onPress, children }) => {
  return (
    <Pressable
      style={{
        backgroundColor: 'blue',
        padding: 16,
        margin: 10,
        borderRadius: 8
      }}
      onPress={onPress}
    >
      <Text style={{ color: 'white', fontSize: 24 }}>
        {children || title}
      </Text>
    </Pressable>
  );
};

MyButton.propTypes = {
  title: PropTypes.string,
  name: PropTypes.string.isRequired,
  onPress: PropTypes.func.isRequired,
  children: PropTypes.node,
};

MyButton.defaultProps = {
  title: 'button',
};

export default MyButton;