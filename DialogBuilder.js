/**
 * @providesModule DialogBuilder
 */

'use strict';

var { NativeModules } = require('react-native');

class DialogBuilder {
  title(title) {
    NativeModules.DialogBuilder.title(title);
    return this;
  }
  content(content) {
    NativeModules.DialogBuilder.content(content);
    return this;
  }
  show() {
    NativeModules.DialogBuilder.show()
  }
}