(ns com.amazonaws.auth.CanHandleNullCredentials
  "Used to explicitly indicate that a Signer can gracefully handle
  credentials being null when calling Signer.sign(SignableRequest, AWSCredentials)"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth CanHandleNullCredentials]))

