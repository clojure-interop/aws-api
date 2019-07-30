(ns com.amazonaws.services.managedblockchain.AbstractAmazonManagedBlockchainAsync
  "Abstract implementation of AmazonManagedBlockchainAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.managedblockchain AbstractAmazonManagedBlockchainAsync]))

(defn vote-on-proposal-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VoteOnProposal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.VoteOnProposalResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.voteOnProposalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest request]
    (-> this (.voteOnProposalAsync request))))

(defn list-invitations-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.ListInvitationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInvitations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListInvitationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListInvitationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInvitationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListInvitationsRequest request]
    (-> this (.listInvitationsAsync request))))

(defn list-proposal-votes-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProposalVotes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListProposalVotesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProposalVotesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest request]
    (-> this (.listProposalVotesAsync request))))

(defn get-member-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.GetMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetMemberResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetMemberRequest request]
    (-> this (.getMemberAsync request))))

(defn list-nodes-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.ListNodesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListNodesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNodesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNodesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNodesRequest request]
    (-> this (.listNodesAsync request))))

(defn create-node-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.CreateNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNodeRequest request]
    (-> this (.createNodeAsync request))))

(defn list-members-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.ListMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListMembersRequest request]
    (-> this (.listMembersAsync request))))

(defn get-node-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.GetNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNodeRequest request]
    (-> this (.getNodeAsync request))))

(defn delete-member-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.DeleteMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.DeleteMemberResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteMemberRequest request]
    (-> this (.deleteMemberAsync request))))

(defn get-proposal-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.GetProposalRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProposal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetProposalResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetProposalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProposalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetProposalRequest request]
    (-> this (.getProposalAsync request))))

(defn delete-node-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.DeleteNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.DeleteNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.DeleteNodeRequest request]
    (-> this (.deleteNodeAsync request))))

(defn list-networks-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.ListNetworksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNetworks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListNetworksResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNetworksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNetworksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListNetworksRequest request]
    (-> this (.listNetworksAsync request))))

(defn list-proposals-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.ListProposalsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProposals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.ListProposalsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProposalsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.ListProposalsRequest request]
    (-> this (.listProposalsAsync request))))

(defn get-network-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.GetNetworkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNetwork operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.GetNetworkResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNetworkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNetworkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.GetNetworkRequest request]
    (-> this (.getNetworkAsync request))))

(defn create-member-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.CreateMemberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMember operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateMemberResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateMemberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMemberAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateMemberRequest request]
    (-> this (.createMemberAsync request))))

(defn create-network-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.CreateNetworkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetwork operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateNetworkResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNetworkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateNetworkRequest request]
    (-> this (.createNetworkAsync request))))

(defn reject-invitation-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.RejectInvitationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectInvitation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.RejectInvitationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.RejectInvitationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectInvitationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.RejectInvitationRequest request]
    (-> this (.rejectInvitationAsync request))))

(defn create-proposal-async
  "Description copied from interface: AmazonManagedBlockchainAsync

  request - `com.amazonaws.services.managedblockchain.model.CreateProposalRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProposal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.managedblockchain.model.CreateProposalResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateProposalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProposalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonManagedBlockchainAsync this ^com.amazonaws.services.managedblockchain.model.CreateProposalRequest request]
    (-> this (.createProposalAsync request))))

