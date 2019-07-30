(ns com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3EncryptionClientBuilder]))

(defn ->amazon-s-3-encryption-client-builder
  "Constructor."
  (^AmazonS3EncryptionClientBuilder []
    (new AmazonS3EncryptionClientBuilder )))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder`"
  (^com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder []
    (AmazonS3EncryptionClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain
   and DefaultAwsRegionProviderChain chain - `com.amazonaws.services.s3.AmazonS3Encryption`"
  (^com.amazonaws.services.s3.AmazonS3Encryption []
    (AmazonS3EncryptionClientBuilder/defaultClient )))

(defn set-encryption-materials
  "Sets the encryption materials to be used to encrypt and decrypt data

  encryption-materials - a provider for the encryption materials - `com.amazonaws.services.s3.model.EncryptionMaterialsProvider`"
  ([^AmazonS3EncryptionClientBuilder this ^com.amazonaws.services.s3.model.EncryptionMaterialsProvider encryption-materials]
    (-> this (.setEncryptionMaterials encryption-materials))))

(defn with-encryption-materials
  "Sets the encryption materials to be used to encrypt and decrypt data

  encryption-materials - A provider for the encryption materials to be used to encrypt and decrypt data. - `com.amazonaws.services.s3.model.EncryptionMaterialsProvider`

  returns: this object for method chaining - `com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder`"
  (^com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder [^AmazonS3EncryptionClientBuilder this ^com.amazonaws.services.s3.model.EncryptionMaterialsProvider encryption-materials]
    (-> this (.withEncryptionMaterials encryption-materials))))

(defn set-crypto-configuration
  "Sets the crypto configuration whose parameters will be used to encrypt and decrypt data.

  crypto-config - crypto configuration - `com.amazonaws.services.s3.model.CryptoConfiguration`"
  ([^AmazonS3EncryptionClientBuilder this ^com.amazonaws.services.s3.model.CryptoConfiguration crypto-config]
    (-> this (.setCryptoConfiguration crypto-config))))

(defn with-crypto-configuration
  "Sets the crypto configuration whose parameters will be used to encrypt and decrypt data.

  crypto-config - crypto configuration - `com.amazonaws.services.s3.model.CryptoConfiguration`

  returns: this object for method chaining - `com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder`"
  (^com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder [^AmazonS3EncryptionClientBuilder this ^com.amazonaws.services.s3.model.CryptoConfiguration crypto-config]
    (-> this (.withCryptoConfiguration crypto-config))))

(defn set-kms
  "Sets the KMS implementation to be used throughout the crypto process

  kms - an AWSKMS implementation (e.g. AWSKMSClient) - `com.amazonaws.services.kms.AWSKMS`"
  ([^AmazonS3EncryptionClientBuilder this ^com.amazonaws.services.kms.AWSKMS kms]
    (-> this (.setKms kms))))

(defn with-kms-client
  "Sets the KMS implementation to be used throughout the crypto process

  kms - an AWSKMS implementation (e.g. AWSKMSClient) - `com.amazonaws.services.kms.AWSKMS`

  returns: this object for method chaining - `com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder`"
  (^com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder [^AmazonS3EncryptionClientBuilder this ^com.amazonaws.services.kms.AWSKMS kms]
    (-> this (.withKmsClient kms))))

