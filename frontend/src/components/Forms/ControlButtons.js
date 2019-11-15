import React from 'react';

const ControlButtons = ({editing, edit, save, deleteAction}) => (
    <div className="d-flex justify-content-end">
    <div className="btn btn-group m-0 p-0">
      {!editing && (
        <button
          className="btn btn-outline-primary"
          onClick={() => edit()}
        >
          editar
        </button>
      )}
      {editing && (
        <button
          className="btn btn-outline-success"
          onClick={() => save()}
        >
          salvar
        </button>
      )}

    {deleteAction !== undefined && (<button className="btn btn-outline-danger" onClick={() => deleteAction()}>excluir</button>)}
    </div>
  </div>
)

export default ControlButtons;