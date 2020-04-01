import React from 'react';
import {
  StyleSheet,
  View,
  Text,
  TouchableOpacity,
  NativeModules 
} from 'react-native';

const App: () => React$Node = () => {
  return (
    <>
      <View style={styles.container}>
        <TouchableOpacity
          style={styles.button}
          onPress={() => NativeModules.Home.navigateToHome()}
        >
          <Text style={styles.textColor}>Chamar Módulo Nativo</Text>
        </TouchableOpacity>
      </View>
    </>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },

  button: {
    width: '80%',
    height: 40,
    backgroundColor: 'green',
    justifyContent: 'center',
    alignItems: 'center'
  },

  textColor: {
    color: 'white'
  }
});

export default App;
