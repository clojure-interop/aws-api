(ns com.amazonaws.auth.AWS4UnsignedPayloadSigner
  "Exactly the same as AWS4Signer except if the request is being sent
  over HTTPS, then it returns the string UNSIGNED-PAYLOAD as the
  content SHA-256 so services that support it can avoid needing to calculate
  the value when authorizing the request.

  Payloads are still signed for requests over HTTP to preserve the request
  integrity over a non-secure transport."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWS4UnsignedPayloadSigner]))

(defn ->aws-4-unsigned-payload-signer
  "Constructor.

  clock - `com.amazonaws.auth.SdkClock`"
  (^AWS4UnsignedPayloadSigner [^com.amazonaws.auth.SdkClock clock]
    (new AWS4UnsignedPayloadSigner clock))
  (^AWS4UnsignedPayloadSigner []
    (new AWS4UnsignedPayloadSigner )))

(defn sign
  "Description copied from interface: Signer

  request - The request to sign. - `com.amazonaws.SignableRequest`
  credentials - The credentials to sign the request with. - `com.amazonaws.auth.AWSCredentials`"
  ([^AWS4UnsignedPayloadSigner this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.sign request credentials))))

