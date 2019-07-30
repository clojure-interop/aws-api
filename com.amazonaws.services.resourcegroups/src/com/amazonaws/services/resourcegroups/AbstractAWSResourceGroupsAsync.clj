(ns com.amazonaws.services.resourcegroups.AbstractAWSResourceGroupsAsync
  "Abstract implementation of AWSResourceGroupsAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroups AbstractAWSResourceGroupsAsync]))

(defn create-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.CreateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn list-group-resources-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest request]
    (-> this (.listGroupResourcesAsync request))))

(defn search-resources-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.SearchResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.SearchResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest request]
    (-> this (.searchResourcesAsync request))))

(defn get-group-query-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetGroupQueryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest request]
    (-> this (.getGroupQueryAsync request))))

(defn update-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest request]
    (-> this (.updateGroupAsync request))))

(defn get-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.GetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest request]
    (-> this (.getGroupAsync request))))

(defn list-groups-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.ListGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest request]
    (-> this (.listGroupsAsync request))))

(defn delete-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn tag-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.TagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Tag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.TagResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.TagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.TagRequest request]
    (-> this (.tagAsync request))))

(defn update-group-query-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroupQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest request]
    (-> this (.updateGroupQueryAsync request))))

(defn untag-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.UntagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Untag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UntagResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UntagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.UntagRequest request]
    (-> this (.untagAsync request))))

(defn get-tags-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.GetTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsAsync this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest request]
    (-> this (.getTagsAsync request))))

