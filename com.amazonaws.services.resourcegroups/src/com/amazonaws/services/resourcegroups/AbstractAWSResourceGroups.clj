(ns com.amazonaws.services.resourcegroups.AbstractAWSResourceGroups
  "Abstract implementation of AWSResourceGroups. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroups AbstractAWSResourceGroups]))

(defn get-group-query
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest`

  returns: Result of the GetGroupQuery operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetGroupQueryResult`"
  (^com.amazonaws.services.resourcegroups.model.GetGroupQueryResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest request]
    (-> this (.getGroupQuery request))))

(defn delete-group
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.DeleteGroupResult`"
  (^com.amazonaws.services.resourcegroups.model.DeleteGroupResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn update-group
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UpdateGroupResult`"
  (^com.amazonaws.services.resourcegroups.model.UpdateGroupResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn create-group
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.CreateGroupResult`"
  (^com.amazonaws.services.resourcegroups.model.CreateGroupResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn list-group-resources
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest`

  returns: Result of the ListGroupResources operation returned by the service. - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult`"
  (^com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest request]
    (-> this (.listGroupResources request))))

(defn tag
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.TagRequest`

  returns: Result of the Tag operation returned by the service. - `com.amazonaws.services.resourcegroups.model.TagResult`"
  (^com.amazonaws.services.resourcegroups.model.TagResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.TagRequest request]
    (-> this (.tag request))))

(defn update-group-query
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest`

  returns: Result of the UpdateGroupQuery operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult`"
  (^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest request]
    (-> this (.updateGroupQuery request))))

(defn shutdown
  "Description copied from interface: AWSResourceGroups"
  ([^AbstractAWSResourceGroups this]
    (-> this (.shutdown))))

(defn untag
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.UntagRequest`

  returns: Result of the Untag operation returned by the service. - `com.amazonaws.services.resourcegroups.model.UntagResult`"
  (^com.amazonaws.services.resourcegroups.model.UntagResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.UntagRequest request]
    (-> this (.untag request))))

(defn search-resources
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.SearchResourcesRequest`

  returns: Result of the SearchResources operation returned by the service. - `com.amazonaws.services.resourcegroups.model.SearchResourcesResult`"
  (^com.amazonaws.services.resourcegroups.model.SearchResourcesResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest request]
    (-> this (.searchResources request))))

(defn get-tags
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetTagsResult`"
  (^com.amazonaws.services.resourcegroups.model.GetTagsResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn list-groups
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.resourcegroups.model.ListGroupsResult`"
  (^com.amazonaws.services.resourcegroups.model.ListGroupsResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSResourceGroups

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSResourceGroups this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-group
  "Description copied from interface: AWSResourceGroups

  request - `com.amazonaws.services.resourcegroups.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.resourcegroups.model.GetGroupResult`"
  (^com.amazonaws.services.resourcegroups.model.GetGroupResult [^AbstractAWSResourceGroups this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest request]
    (-> this (.getGroup request))))

