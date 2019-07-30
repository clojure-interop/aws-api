(ns com.amazonaws.services.cognitoidentity.AbstractAmazonCognitoIdentity
  "Abstract implementation of AmazonCognitoIdentity. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitoidentity AbstractAmazonCognitoIdentity]))

(defn list-tags-for-resource
  "Description copied from interface: AmazonCognitoIdentity

  request - `com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-identity-pool
  "Description copied from interface: AmazonCognitoIdentity

  request - An object representing an Amazon Cognito identity pool. - `com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest`

  returns: Result of the UpdateIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult`"
  (^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest request]
    (-> this (.updateIdentityPool request))))

(defn set-region
  "Description copied from interface: AmazonCognitoIdentity

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCognitoIdentity this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-identity-pools
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the ListIdentityPools action. - `com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest`

  returns: Result of the ListIdentityPools operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult`"
  (^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest request]
    (-> this (.listIdentityPools request))))

(defn get-credentials-for-identity
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the GetCredentialsForIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest`

  returns: Result of the GetCredentialsForIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult`"
  (^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest request]
    (-> this (.getCredentialsForIdentity request))))

(defn delete-identity-pool
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the DeleteIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest`

  returns: Result of the DeleteIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolResult`"
  (^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest request]
    (-> this (.deleteIdentityPool request))))

(defn untag-resource
  "Description copied from interface: AmazonCognitoIdentity

  request - `com.amazonaws.services.cognitoidentity.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UntagResourceResult`"
  (^com.amazonaws.services.cognitoidentity.model.UntagResourceResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-identity-pool
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the DescribeIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest`

  returns: Result of the DescribeIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult`"
  (^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest request]
    (-> this (.describeIdentityPool request))))

(defn get-open-id-token-for-developer-identity
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the GetOpenIdTokenForDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest`

  returns: Result of the GetOpenIdTokenForDeveloperIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult`"
  (^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest request]
    (-> this (.getOpenIdTokenForDeveloperIdentity request))))

(defn unlink-developer-identity
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the UnlinkDeveloperIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest`

  returns: Result of the UnlinkDeveloperIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityResult`"
  (^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest request]
    (-> this (.unlinkDeveloperIdentity request))))

(defn lookup-developer-identity
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the LookupDeveloperIdentityInput action. - `com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest`

  returns: Result of the LookupDeveloperIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult`"
  (^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest request]
    (-> this (.lookupDeveloperIdentity request))))

(defn get-identity-pool-roles
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the GetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest`

  returns: Result of the GetIdentityPoolRoles operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult`"
  (^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest request]
    (-> this (.getIdentityPoolRoles request))))

(defn delete-identities
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the DeleteIdentities action. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest`

  returns: Result of the DeleteIdentities operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult`"
  (^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest request]
    (-> this (.deleteIdentities request))))

(defn shutdown
  "Description copied from interface: AmazonCognitoIdentity"
  ([^AbstractAmazonCognitoIdentity this]
    (-> this (.shutdown))))

(defn create-identity-pool
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the CreateIdentityPool action. - `com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest`

  returns: Result of the CreateIdentityPool operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult`"
  (^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest request]
    (-> this (.createIdentityPool request))))

(defn set-endpoint
  "Description copied from interface: AmazonCognitoIdentity

  endpoint - The endpoint (ex: \"cognito-identity.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://cognito-identity.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCognitoIdentity this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-identity-pool-roles
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the SetIdentityPoolRoles action. - `com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest`

  returns: Result of the SetIdentityPoolRoles operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesResult`"
  (^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest request]
    (-> this (.setIdentityPoolRoles request))))

(defn get-id
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the GetId action. - `com.amazonaws.services.cognitoidentity.model.GetIdRequest`

  returns: Result of the GetId operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetIdResult`"
  (^com.amazonaws.services.cognitoidentity.model.GetIdResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetIdRequest request]
    (-> this (.getId request))))

(defn list-identities
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the ListIdentities action. - `com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest`

  returns: Result of the ListIdentities operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult`"
  (^com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest request]
    (-> this (.listIdentities request))))

(defn merge-developer-identities
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the MergeDeveloperIdentities action. - `com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest`

  returns: Result of the MergeDeveloperIdentities operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult`"
  (^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest request]
    (-> this (.mergeDeveloperIdentities request))))

(defn get-open-id-token
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the GetOpenIdToken action. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest`

  returns: Result of the GetOpenIdToken operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult`"
  (^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest request]
    (-> this (.getOpenIdToken request))))

(defn describe-identity
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the DescribeIdentity action. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest`

  returns: Result of the DescribeIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult`"
  (^com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest request]
    (-> this (.describeIdentity request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCognitoIdentity

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCognitoIdentity this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AmazonCognitoIdentity

  request - `com.amazonaws.services.cognitoidentity.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.TagResourceResult`"
  (^com.amazonaws.services.cognitoidentity.model.TagResourceResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn unlink-identity
  "Description copied from interface: AmazonCognitoIdentity

  request - Input to the UnlinkIdentity action. - `com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest`

  returns: Result of the UnlinkIdentity operation returned by the service. - `com.amazonaws.services.cognitoidentity.model.UnlinkIdentityResult`"
  (^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityResult [^AbstractAmazonCognitoIdentity this ^com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest request]
    (-> this (.unlinkIdentity request))))

