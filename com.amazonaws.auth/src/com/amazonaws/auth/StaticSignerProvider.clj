(ns com.amazonaws.auth.StaticSignerProvider
  "Implementation of SignerProvider that always returns the same signer regardless of
  context."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth StaticSignerProvider]))

(defn ->static-signer-provider
  "Constructor.

  signer - `com.amazonaws.auth.Signer`"
  (^StaticSignerProvider [^com.amazonaws.auth.Signer signer]
    (new StaticSignerProvider signer)))

(defn get-signer
  "context - `com.amazonaws.internal.auth.SignerProviderContext`

  returns: `com.amazonaws.auth.Signer`"
  (^com.amazonaws.auth.Signer [^StaticSignerProvider this ^com.amazonaws.internal.auth.SignerProviderContext context]
    (-> this (.getSigner context))))

