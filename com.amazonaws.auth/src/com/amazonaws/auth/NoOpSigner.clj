(ns com.amazonaws.auth.NoOpSigner
  "A No-Op Signer Implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth NoOpSigner]))

(defn ->no-op-signer
  "Constructor."
  (^NoOpSigner []
    (new NoOpSigner )))

(defn sign
  "Description copied from interface: Signer

  request - The request to sign. - `com.amazonaws.SignableRequest`
  credentials - The credentials to sign the request with. - `com.amazonaws.auth.AWSCredentials`"
  ([^NoOpSigner this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.sign request credentials))))

