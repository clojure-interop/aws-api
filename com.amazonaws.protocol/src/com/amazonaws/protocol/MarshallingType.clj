(ns com.amazonaws.protocol.MarshallingType
  "Represents the various types supported for marshalling."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol MarshallingType]))

(defn default-marshaller-for-type?
  "Determine whether this marshalling type is the default marshaller for the provided class. This is used to automatically
   determine the marshaller to be used in the contents of lists or maps.

  type - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^MarshallingType this ^java.lang.Class type]
    (-> this (.isDefaultMarshallerForType type))))

